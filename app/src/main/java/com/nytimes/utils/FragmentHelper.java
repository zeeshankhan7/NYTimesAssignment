package com.nytimes.utils;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


/**
 * Created by Zeeshan on 14-07-2022.
 * <p/>
 * This is a fragment utility class which is responsable for add ,replace fragment
 */
@SuppressWarnings("ALL")
public class FragmentHelper {
    /**
     * @param fragment
     * @param container
     * @param fm
     */
    @SuppressWarnings({"JavaDoc", "unused"})
    public static void addAndInitFragment(Fragment fragment, int container, FragmentManager fm) {
        if (!fragment.isAdded()) {
            try {
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(container, fragment, fragment.getClass().getSimpleName());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();


            } catch (Exception e) {
//                Logger.d("addAndInitFragment");
            }

        }

    }

    /**
     * @param fragment
     * @param container
     * @param fm
     */
    @SuppressWarnings({"JavaDoc", "unused"})
    public static void replaceAndInitFragment(Fragment fragment, int container, FragmentManager fm) {
        if (!fragment.isAdded()) {
            try {
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(container, fragment, fragment.getClass().getSimpleName());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            } catch (Exception e) {
//                Logger.d("replaceAndInitFragment");
            }

        }

    }

    /**
     * @param fragment
     * @param container
     * @param fm
     */
    @SuppressWarnings({"JavaDoc", "unused"})
    public static void replaceAndInitFragment(Fragment fragment, int container, FragmentManager fm, boolean isAnimate) {
        if (!fragment.isAdded()) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(container, fragment, fragment.getClass().getSimpleName());
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.commit();
        }

    }

    /**
     * @param fragment
     * @param container
     * @param fm
     */
    @SuppressWarnings({"JavaDoc", "unused"})
    public static void addAndInitFragmentWithBackStack(Fragment fragment, int container, FragmentManager fm) {

        if(fm.findFragmentByTag(fragment.getClass().getSimpleName())==null) {
            FragmentTransaction ft = fm.beginTransaction();
//            ft.setCustomAnimations(R.animator.fragment_animation_left_enter,R.animator.fragment_animation_left_out, R.animator.fragment_animation_right_enter,R.animator.fragment_animation_right_out);
            ft.add(container, fragment, fragment.getClass().getSimpleName());
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.addToBackStack(fragment.getClass().getSimpleName());
            ft.commit();
        }
    }

    public static void addAndInitFragmentWithBackStacknoAnimation(Fragment fragment, int container, FragmentManager fm) {

            FragmentTransaction ft = fm.beginTransaction();
            ft.add(container, fragment, fragment.getClass().getSimpleName());
            ft.setTransition(FragmentTransaction.TRANSIT_NONE);
            ft.addToBackStack(fragment.getClass().getSimpleName());
            ft.commit();
    }

    public static void addAndInitFragmentWithBackStackWithNoAnimation(Fragment fragment, int container, FragmentManager fm) {

        if(fm.findFragmentByTag(fragment.getClass().getSimpleName())==null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(container, fragment, fragment.getClass().getSimpleName());
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.addToBackStack(fragment.getClass().getSimpleName());
            ft.commit();
        }
    }
  /*  public static void addAndInitFragmentWithBackStackWithBottomToTopAnimation(Fragment fragment, int container, FragmentManager fm) {

        if(fm.findFragmentByTag(fragment.getClass().getSimpleName())==null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.setCustomAnimations(R.animator.fragment_animation_slide_in_up, R.animator.fragment_animation_slide_in_down);;
            ft.add(container, fragment, fragment.getClass().getSimpleName());
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.addToBackStack(fragment.getClass().getSimpleName());
            ft.commit();
        }
    }*/
    /**
     * @param fragment
     * @param container
     * @param fm
     */
    @SuppressWarnings({"JavaDoc", "unused"})
    public static void addAndInitFragmentWithBackStackReplace(Fragment fragment, int container, FragmentManager fm) {
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(container, fragment, fragment.getClass().getSimpleName());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.addToBackStack(fragment.getClass().getSimpleName());
        ft.commit();
    }

    /**
     * @param fragment
     * @param container
     * @param fm
     */
    @SuppressWarnings({"JavaDoc", "unused"})
    public static void addAndInitFragmentWithBackStackBacCompact(androidx.fragment.app.Fragment fragment, int container, androidx.fragment.app.FragmentManager fm) {
        androidx.fragment.app.FragmentTransaction ft = fm.beginTransaction();
        ft.add(container, fragment, fragment.getClass().getSimpleName());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.addToBackStack(fragment.getClass().getSimpleName());
        ft.commit();
    }

    /**
     * @param fragment
     * @param container
     * @param fm
     */

    /*public static void addAndInitFragmentWithAnimBackStack(Fragment fragment, int container, FragmentManager fm) {
        Fragment a = fm.findFragmentByTag(fragment.getClass().getSimpleName());
        if(a!=null &&a.isAdded()) return;
        FragmentTransaction ft = fm.beginTransaction();
        ft.setCustomAnimations(R.animator.top_to_bottom, R.animator.bottom_to_top, R.animator.top_to_bottom, R.animator.bottom_to_top);
        ft.add(container, fragment, fragment.getClass().getSimpleName());
//        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.addToBackStack(fragment.getClass().getSimpleName());
        ft.commit();

    }*/

    /**
     * @param fragment
     * @param container
     * @param fm
     */
    @SuppressWarnings({"JavaDoc", "unused"})
    public static void replaceAndInitFragmentWithBackStack(Fragment fragment, int container, FragmentManager fm) {
        if (!fragment.isAdded()) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(container, fragment, fragment.getClass().getSimpleName());
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.addToBackStack(fragment.getClass().getSimpleName());
            ft.commit();
        }
    }

    /**
     * @param tag
     * @param fm  Fragment manager
     */
    @SuppressWarnings({"JavaDoc", "unused"})
    public static Fragment findFragmentByTag(String tag, FragmentManager fm) {
        Fragment fragment = null;
        if (fm != null && fm.findFragmentByTag(tag) != null) {
            fragment = fm.findFragmentByTag(tag);
        }
        return fragment;
    }


    /**
     *
     * @param fm
     */
    public static void removeFragmentFromStack(FragmentManager fm)
    {
        for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }
    }

    public static Fragment getCurrentFragment(FragmentManager fragmentManager) {
        int count = fragmentManager.getBackStackEntryCount();
        if (count > 0) {
            FragmentManager.BackStackEntry backStackEntry = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1);
            String tag = backStackEntry.getName();
            return fragmentManager.findFragmentByTag(tag);
        }
        return null;
    }

    public static int getFragmentCount(FragmentManager fragmentManager) {
        int count = fragmentManager.getBackStackEntryCount();
        return count;
    }


}
