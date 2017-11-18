package louis.stzb;

public class General {
    /**
     * 名字
     */
    protected String mName;
    /**
     * 级别
     */
    protected int mLevel;
    /**
     * 兵力
     */
    protected int mForces;
    /**
     * 体力
     */
    protected int mPower;
    /**
     * 兵种
     */
    protected int mService;
    /**
     * 统率
     */
    protected double mCost;
    /**
     * 攻击距离
     */
    protected int mStrikeDistance;
    /**
     * 阵营
     */
    protected int mCountry;
    /**
     * 攻击
     */
    protected double mAttack;
    /**
     * 攻击成长
     */
    protected double mAttackInc;
    /**
     * 防御
     */
    protected double mDefense;
    /**
     * 防御成长
     */
    protected double mDefenseInc;
    /**
     * 谋略
     */
    protected double mStrategy;
    /**
     * 谋略成长
     */
    protected double mStrategyInc;
    /**
     * 攻城
     */
    protected double mSiege;
    /**
     * 攻城成长
     */
    protected double mSiegeInc;
    /**
     * 速度
     */
    protected double mVelocity;
    /**
     * 速度成长
     */
    protected double mVelocityInc;

    /**
     * 第一战法
     */
    protected Magic mMagic1;
    protected Magic mMagic2;
    protected Magic mMagic3;



    public General(String name, int service, double cost, int distance, int country, double attack, double defense, double strategy, double siege, double velocity,
                   double a_inc, double d_inc, double str_inc, double siege_inc, double v_inc, Magic firstMagic, int level) {
        mName = name;
        mService = service;
        mStrikeDistance = distance;
        mCountry = country;
        mAttack = attack;
        mDefense = defense;
        mStrategy = strategy;
        mSiege = siege;
        mVelocity = velocity;
        mAttackInc = a_inc;
        mDefenseInc = d_inc;
        mStrategyInc = str_inc;
        mSiegeInc = siege_inc;
        mVelocityInc = v_inc;
        mMagic1 = firstMagic;
        mLevel = level;
    }

    public void print() {
        System.out.println("武将姓名：" + mName);
        System.out.println("50级攻击力：" + Double.valueOf(mAttack + (50-mLevel) * mAttackInc));
        System.out.println("50级防御力：" + Double.valueOf(mDefense + (50-mLevel) * mDefenseInc));
        System.out.println("50级谋略：" + Double.valueOf(mStrategy + (50-mLevel) * mStrategyInc));
        System.out.println("50级攻城：" + Double.valueOf(mSiege + (50-mLevel) * mSiegeInc));
        System.out.println("50级速度：" + Double.valueOf(mVelocity + (50-mLevel) * mVelocityInc));
    }
}
