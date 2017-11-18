package louis.stzb.magic;

import louis.stzb.Magic;

public class ActiveMagic extends Magic{
    public ActiveMagic(String name, int services, int distance, double prob){
       mType = Magic.TYPE_ACTIVE;
       mName = name;
       mServices = services;

    }
}
