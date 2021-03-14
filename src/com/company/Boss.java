package com.company;

public class Boss extends GameEntity{
    private Weapon weapon;

    public String printInfo(){
        return "Health:" + getHealth() + ";  Damage:" + getDamage() +";  Weapon name:" + getWeapon().getWeaponName() + ";  Weapon type:"+ getWeapon().getWeaponType();

    }

    public Weapon getWeapon() {
        return weapon;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
