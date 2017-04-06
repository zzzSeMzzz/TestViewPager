package ru.sem.testviewpager;



public enum CustomPagerEnum {

    RED("RecycleView", R.layout.pg1),
    BLUE("jaust page", R.layout.pg2);

    private String mTitleResId;
    private int mLayoutResId;

    CustomPagerEnum(String titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public String getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
