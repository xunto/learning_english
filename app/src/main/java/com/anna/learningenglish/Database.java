package com.anna.learningenglish;

import com.anna.learningenglish.irregular_verbs.IrregularVerb;

public class Database {
    public  static IrregularVerb findIrregularVerb(int i) {
        return Database.database[i];
    }

    public static int getLength(){
        return database.length;
    }

    private static IrregularVerb[] database = {

            new IrregularVerb("blow", "blew", "blown", "blow that opportunity"),

            new IrregularVerb("wear", "wore", "worn", "wear my mittens"),

            new IrregularVerb("fly", "flew", "flown", "fly that flag"),

            new IrregularVerb("tear", "tore", "torn", "tear the curtain"),

            new IrregularVerb("run", "ran", "run", "run that marathon"),

            new IrregularVerb("bet", "bet", "bet", "bet on that race (Hint:"),

            new IrregularVerb("teach", "taught", "taught", "teach that class"),

            new IrregularVerb("shrink", "shrank", "shrunk", "shrink those socks"),

            new IrregularVerb("sell", "sold", "sold", "sell my wig"),

            new IrregularVerb("hurt", "hurt", "hurt", "hurt my thumb"),

            new IrregularVerb("lay", "laid", "laid", "lay that book down"),

            new IrregularVerb("beat", "beat", "beaten", "beat those eggs"),

            new IrregularVerb("hang", "hung", "hung", "hang that wallpaper"),

            new IrregularVerb("shake", "shook", "shaken", "shake that coke bottle"),

            new IrregularVerb("lie", "lay", "lain", "lie down in that grime"),

            new IrregularVerb("sit", "sat", "sat", "sit on that thumb tack"),

            new IrregularVerb("steal", "stole", "stolen", "steal your heart"),

            new IrregularVerb("lie", "lied", "lied", "lie to you"),

            new IrregularVerb("dig", "dug", "dug", "dig that hole"),

            new IrregularVerb("sting", "stung", "stung", "sting that bee"),

            new IrregularVerb("kneel", "knelt", "knelt", "kneel in the mud"),

            new IrregularVerb("withhold", "withheld", "withheld", "withhold my praise"),

            new IrregularVerb("seek", "sought", "sought", "seek your advice"),

            new IrregularVerb("slide", "slid", "slid", "slide down that slide"),

            new IrregularVerb("split", "split", "split", "split my jeans"),

            new IrregularVerb("bleed", "bled", "bled", "bleed on your rug"),

            new IrregularVerb("forbid", "forbid", "forbidden", "forbid that marriage"),

            new IrregularVerb("creep", "crept", "crept", "creep into your bed"),

            new IrregularVerb("flee", "fled", "fled", "flee your company"),

            new IrregularVerb("sink", "sank", "sunk", "sink that boat"),

            new IrregularVerb("burst", "burst", "burst", "burst that balloon"),

            new IrregularVerb("sweep", "swept", "swept", "sweep that floor"),

            new IrregularVerb("spit", "spat", "spat", "spit out that gum"),

            new IrregularVerb("stink", "stank", "stunk", "stink up the joint"),

            new IrregularVerb("overcome", "overcame", "overcome", "overcome the urge to bop you on the head"),

            new IrregularVerb("knit", "knit", "knit", "knit those mittens"),

            new IrregularVerb("keep", "kept", "kept", "keep you waiting"),

            new IrregularVerb("shoot", "shot", "shot", "shoot that film"),

            new IrregularVerb("swing", "swang", "swung", "swing on that swing"),

            new IrregularVerb("spring", "sprang", "sprung", "spring that surprise on you"),

            new IrregularVerb("bend", "bent", "bent", "bend that rule"),

            new IrregularVerb("light", "lit", "lit", "light that cigar"),

            new IrregularVerb("grind", "ground", "ground", "grind that pepper"),

            new IrregularVerb("hide", "hid", "hidden", "hide my love for you"),

            new IrregularVerb("mistake", "mistook", "mistaken", "mistake you for your brother"),

            new IrregularVerb("spin", "spun", "spun", "spin that web"),

            new IrregularVerb("think", "thought", "thought", "think up that crazy plan"),

            new IrregularVerb("swear", "swore", "sworn", "swear at my boss"),

            new IrregularVerb("strike", "struck", "struck", "strike that deal"),

            new IrregularVerb("build", "built", "built", "build that palace"),

            new IrregularVerb("shut", "shut", "shut", "shut the door"),

            new IrregularVerb("weep", "wept", "wept", "weep those crocodile tears"),

            new IrregularVerb("wind", "wound", "wound", "wind that watch"),

            new IrregularVerb("stick", "stuck", "stuck", "stick out my tongue"),

            new IrregularVerb("spread", "spread", "spread", "spread that butter"),

            new IrregularVerb("fling", "flung", "flung", "fling you to the ground"),

            new IrregularVerb("weave", "wove", "woven", "weave that scarf"),

            new IrregularVerb("shake", "shook", "shaken", "shake your hand"),

            new IrregularVerb("drink", "drank", "drunk", "drink that awful concoction"),

            new IrregularVerb("feed", "fed", "fed", "feed that fat cat"),

            new IrregularVerb("hold", "held", "held", "hold that meeting"),

            new IrregularVerb("see", "saw", "seen", "see that concert"),

            new IrregularVerb("read", "read ", "read ", "read that story"),

            new IrregularVerb("bite", "bit", "bitten", "bite into that wormy apple"),

            new IrregularVerb("leave", "left", "left", "leave my old apartment"),

            new IrregularVerb("cost", "cost", "cost", "cost so much"),

            new IrregularVerb("begin", "began", "begun", "begin that project"),

            new IrregularVerb("buy", "bought", "bought", "buy that alarm clock"),

            new IrregularVerb("win", "won", "won", "win the lottery"),

            new IrregularVerb("sleep", "slept", "slept", "sleep on that lumpy sofa"),

            new IrregularVerb("bring", "brought", "brought", "bring so much money with me"),

            new IrregularVerb("choose", "chose", "chosen", "choose him"),

            new IrregularVerb("lose", "lost", "lost", "lose my patience"),

            new IrregularVerb("cast", "cast", "cast", "cast my vote for him"),

            new IrregularVerb("swim", "swam", "swum", "swim in the Neva"),

            new IrregularVerb("ring", "rang", "rung", "ring your buzzer"),

            new IrregularVerb("catch", "caught", "caught", "catch that train"),

            new IrregularVerb("stand", "stood", "stood", "stand on my head"),

            new IrregularVerb("break", "broke", "broken", "break your heart"),

            new IrregularVerb("overhear", "overheard", "overheard", "overhear that joke"),

            new IrregularVerb("lend", "lent", "lent", "lend him my umbrella"),

            new IrregularVerb("eat", "ate", "eaten", "eat the last pickle"),

            new IrregularVerb("feel", "felt", "felt", "feel that prickly pear"),

            new IrregularVerb("rise", "rose", "risen", "rise from my seat"),

            new IrregularVerb("withdraw", "withdrew", "withdrawn", "withdraw $25 from my account"),

            new IrregularVerb("drive", "drove", "driven", "drive to the office"),

            new IrregularVerb("hit", "hit", "hit", "hit my knee"),

            new IrregularVerb("pay", "paid", "paid", "pay the bill"),

            new IrregularVerb("grow", "grew", "grown", "grow those tomatoes"),

            new IrregularVerb("set", "set", "set", "set the table"),

            new IrregularVerb("was", " were", "been", "be so rude"),

            new IrregularVerb("sing", "sang", "sung", "sing that ditty"),

            new IrregularVerb("fall", "fell", "fallen", "fall for that trick"),

            new IrregularVerb("wake", "woke", "woken", "wake you up"),

            new IrregularVerb("freeze", "froze", "frozen", "freeze that pumpkin"),

            new IrregularVerb("fight", "fought", "fought", "fight that dragon"),

            new IrregularVerb("ride", "rode", "ridden", "ride that camel")
    };

}