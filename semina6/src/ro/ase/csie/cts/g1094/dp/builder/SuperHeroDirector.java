package ro.ase.csie.cts.g1094.dp.builder;

public class SuperHeroDirector {
    SuperHero.SuperHeroBuilder builder;

    public SuperHeroDirector(SuperHero.SuperHeroBuilder builder){
        this.builder = builder;
    }
    public  SuperHero buildJoker(){
        return builder.isVillain()
                .addLeftWeapon(new Pistol())
                .addRightWeapon(new Pistol())
                .build();
    }
    public  SuperHero buildBatman(){
        return builder
                .addLeftWeapon(new Pistol())
                .addRightWeapon(new Pistol())
                .build();
    }
}
