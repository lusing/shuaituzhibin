package louis.stzb.magic.command;

import louis.stzb.Services;
import louis.stzb.magic.CommandMagic;

public class DaShangSanJun extends CommandMagic {

    public DaShangSanJun(){
        super("大赏三军", Services.SERVICES_ALL,3);
        toEnemy = false;
        toMin = 2;
        toMax = 2;
        mStart = 1;
        mEnd = 3;
        mHurtEnhancement = 0.15 + (0.166-0.15)* 9;
        mMaigcHurtEnhancement = 0.15 + (0.166-0.15)* 9;
    }

    @Override
    public void print(){
        System.out.println("战法名称:"+mName);
        System.out.println("伤害增强："+mHurtEnhancement);
    }
}
