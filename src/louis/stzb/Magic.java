
package louis.stzb;

public class Magic {
    /**
     * 追击战法
     */
    public static final int TYPE_CHASE = 3;
    /**
     * 指挥战法
     */
    public static final int TYPE_COMMAND = 1;
    /**
     * 主动战法
     */
    public static final int TYPE_ACTIVE = 2;
    /**
     * 被动战法
     */
    public static final int TYPE_PASSIVE = 0;

    /**
     * 战法名称
     */
    protected String mName;

    /**
     * 战法类型
     */
    protected int mType;

    /**
     * 限制兵种
     */
    protected int mServices;

    /**
     * 战法攻击距离
     */
    public int mDistance;

    /**
     * 战法发动几率
     */
    public double probability;

    public boolean toEnemy = true;

    public int toMin;

    public int toMax;

    public int prepare = 0;

    public boolean canAttack = false;

    public double hurt;

    public boolean canMagicAttack = false;

    public double magicHurt;

    public boolean canFireAttack = false;

    public double fireHurt;

    public double fireHurt1;

    public double fireHurt2;

    public Magic(){

    }

    public Magic(int type, String name){
        this.mType = type;
        this.mName = name;
    }

    public double getMagicHurt() {
        return magicHurt;
    }

    public double getFireHurt() {
        double step = fireHurt2 - fireHurt1;
        fireHurt = fireHurt1 + step * 9;
        return fireHurt;
    }

    public double getHurt(){
        return hurt;
    }

    public void setHurt(double hurt1, double hurt2){
        this.canAttack = true;
        double step = hurt2 - hurt1;
        hurt = hurt1 + step * 9;
    }

    public void setMagicHurt(double magicHurt1, double magicHurt2){
        this.canMagicAttack = true;
        double step = magicHurt2 - magicHurt1;
        this.magicHurt = magicHurt1 + step * 9;
    }

    public void print(){
        System.out.println("战法名称:"+mName);
        if(this.canAttack){
            System.out.println("物理伤害："+getHurt());
        }
        if(this.canMagicAttack) {
            System.out.println("策略伤害:" + getMagicHurt());
        }
        if(this.canFireAttack){
            System.out.println("火攻伤害:"+getFireHurt());
        }
    }
}
