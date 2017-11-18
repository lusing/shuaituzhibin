
package louis.stzb;

import louis.stzb.magic.ActiveMagic;

public class MagicManager {
    public static Magic ShengDongJiXi;
    public static Magic YanFenQiZhen;
    public static Magic ShuiYanQiJun;
    public static Magic WeiYanKunJun;
    public static Magic ChuGeSiQi;
    public static Magic YiQiDangQian;
    public static Magic JiJiaoZhiShi;
    public static Magic XiongBingPoDi;
    public static Magic WanJianQiFa;
    public static Magic ShiMianMaiFu;

    public static Magic BenXi;
    public static Magic CheXuan;

    public static Magic KuiDi;

    static {
        Magic m = new Magic(Magic.TYPE_ACTIVE,"声东击西");
        //Magic m = new ActiveMagic("声东击西",);
        m.mDistance = 5;
        m.probability = 0.5;
        m.toEnemy = true;
        m.toMin = 1;
        m.toMax = 2;
        m.prepare = 1;
        m.setMagicHurt(115.5,128.3);

        MagicManager.ShengDongJiXi = m;

        m = new Magic(Magic.TYPE_ACTIVE,"焰焚箕轸");
        m.mDistance = 4;
        m.probability = 0.5;
        m.toEnemy = true;
        m.toMin = 2;
        m.toMax = 3;
        m.prepare = 1;
        m.setMagicHurt(59.5,66.1);
        m.canFireAttack = true;
        m.fireHurt1 = 59.5;
        m.fireHurt2 = 66.1;

        MagicManager.YanFenQiZhen = m;

        m = new Magic(Magic.TYPE_ACTIVE,"水淹七军");
        m.mDistance = 3;
        m.probability = 0.5;
        m.toEnemy = true;
        m.toMin = 2;
        m.toMax = 2;
        m.prepare = 1;
        m.setMagicHurt(102.5,113.8);

        MagicManager.ShuiYanQiJun = m;

        m = new Magic(Magic.TYPE_ACTIVE,"危崖困军");
        m.mDistance = 2;
        m.probability = 0.5;
        m.toEnemy = true;
        m.toMin = 2;
        m.toMax = 2;
        m.prepare = 1;
        m.setMagicHurt(105.0,116.6);

        MagicManager.WeiYanKunJun = m;

        m = new Magic(Magic.TYPE_ACTIVE,"楚歌四起");
        m.mDistance = 5;
        m.probability = 0.5;
        m.toEnemy = true;
        m.toMin = 2;
        m.toMax = 3;
        m.prepare = 1;
        m.setMagicHurt(63.5,70.5);

        MagicManager.ChuGeSiQi = m;

        m = new Magic(Magic.TYPE_ACTIVE,"一骑当千");
        m.mDistance = 5;
        m.probability = 0.3;
        m.toEnemy = true;
        m.toMin = 3;
        m.toMax = 3;
        m.prepare = 1;
        m.setHurt(140.0,155.5);

        MagicManager.YiQiDangQian = m;

        m = new Magic(Magic.TYPE_ACTIVE,"犄角之势");
        m.mDistance = 3;
        m.probability = 0.4;
        m.toEnemy = true;
        m.toMin = 1;
        m.toMax = 1;
        m.prepare = 0;
        m.setHurt(90.0,100.0);
        m.setMagicHurt(71.5,79.4);

        MagicManager.JiJiaoZhiShi = m;

        m = new Magic(Magic.TYPE_ACTIVE,"雄兵破敌");
        m.mDistance =4;
        m.probability = 0.35;
        m.toEnemy = true;
        m.toMin = 2;
        m.toMax = 2;
        m.prepare = 1;
        m.setHurt(105.0,116.6);

        MagicManager.XiongBingPoDi = m;

        m = new Magic(Magic.TYPE_ACTIVE,"万箭齐发");
        m.mDistance = 5;
        m.probability = 0.35;
        m.toEnemy = true;
        m.toMin = 3;
        m.toMax = 3;
        m.prepare = 1;
        m.setHurt(75.0,83.3);

        MagicManager.WanJianQiFa = m;

        m = new Magic(Magic.TYPE_ACTIVE,"十面埋伏");
        m.mDistance = 5;
        m.probability = 0.4;
        m.toEnemy = true;
        m.toMin = 3;
        m.toMax = 3;
        m.prepare = 0;
        m.setMagicHurt(65.0,72.2);
        MagicManager.ShiMianMaiFu = m;


        m = new Magic(Magic.TYPE_ACTIVE,"奔袭");
        m.mDistance = 4;
        m.probability = 0.3;
        m.toEnemy = true;
        m.toMin = 1;
        m.toMax = 1;
        m.prepare = 0;
        m.setHurt(112.5,125.0);

        MagicManager.BenXi = m;

        m = new Magic(Magic.TYPE_ACTIVE, "溃堤");
        m.mDistance = 3;
        m.probability = 0.45;
        m.toMin = 2;
        m.toMax = 2;
        m.prepare = 0;
        m.setMagicHurt(39.9,44.3);

        MagicManager.KuiDi = m;

        m = new Magic(Magic.TYPE_ACTIVE,"车悬");
        m.mDistance = 3;
        m.probability = 0.4;
        m.toMin = 1;
        m.toMax = 1;
        m.prepare = 1;
        m.setHurt(177.5,197.2);

        MagicManager.CheXuan = m;
    }
}
