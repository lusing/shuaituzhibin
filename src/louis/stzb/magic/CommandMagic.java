package louis.stzb.magic;

import louis.stzb.Magic;

public class CommandMagic extends Magic{
    /**
     * 战法生效的回合
     */
    protected int mStart;
    /**
     * 战法失效的回合（不含）
     */
    protected int mEnd;
    protected double mHurtEnhancement = 0;
    protected double mMaigcHurtEnhancement = 0;
    public CommandMagic(String name, int services, int distance){
        this.mName = name;
        this.mServices = services;
        this.mDistance = distance;
    }
}
