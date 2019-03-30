package com.production.ksm.medicalinternships;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.production.ksm.medicalinternships.geneng.*;


public class ViewPagerAdapterGeneralEng extends FragmentStatePagerAdapter {

        CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
        int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


// Build a Constructor and assign the passed Values to appropriate values in the class
public ViewPagerAdapterGeneralEng(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

        }

//This method return the fragment for the every position in the View Pager
@Override
public Fragment getItem(int position) {

        if (position == 0) // if the position is 0 we are returning the First tab
        {
        FragmentLondonEng tab1 = new FragmentLondonEng();
        return tab1;
        }
        else if(position == 1)             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentLiverpoolEng tab2 = new FragmentLiverpoolEng();
        return tab2;
        }
        else if(position == 2)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentOxford tab3 = new FragmentOxford();
        return tab3;
        }
        else if(position == 3)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentDublinEng tab4 = new FragmentDublinEng();
        return tab4;
        }
        else if(position == 4)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentBray tab5 = new FragmentBray();
        return tab5;
        }
        else if(position == 5)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentBostonEng tab6 = new FragmentBostonEng();
        return tab6;
        }
        else if(position == 6)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentLaEng tab7 = new FragmentLaEng();
        return tab7;
        }
        else if(position == 7)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentVancouverEng tab8 = new FragmentVancouverEng();
        return tab8;
        }
        else if(position == 8)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentToronto tab9 = new FragmentToronto();
        return tab9;
        }
        else if(position == 9)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentBrisben tab10 = new FragmentBrisben();
        return tab10;
        }

        else            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
        FragmentBournemouth tab11 = new FragmentBournemouth();
        return tab11;
        }

        }

// This method return the titles for the Tabs in the Tab Strip

@Override
public CharSequence getPageTitle(int position) {
        return Titles[position];
        }

// This method return the Number of tabs for the tabs Strip

@Override
public int getCount() {
        return NumbOfTabs;
        }
        }