package rawfish.minebrawlstars.brawl;

//普通攻击和超级技能使用成功或失败原因
public enum AttackResult {
    SUCCESS,//成功
    COOLDOWN,//冷却时间未结束
    INVENTORY,//没有弹药
}
