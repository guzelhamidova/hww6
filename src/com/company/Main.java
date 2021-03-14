package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(150);
        Weapon weapon = new Weapon();
        weapon.setWeaponType(" Автомат; ");
        weapon.setWeaponName(" Калашник ");
        boss.setWeapon(weapon);
        System.out.println("Boss:         " + boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(750);
        skeleton.setDamage(350);
        weapon.setWeaponType(" Crossbow; ");
        weapon.setWeaponName(" Laser ");
        skeleton.setWeapon(weapon);
        skeleton.setQuantityOfArrows(20);
        System.out.println("Skeleton:     " + skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(500);
        skeleton1.setDamage(40);
        weapon.setWeaponType(" Bow; ");
        weapon.setWeaponName(" Needle ");
        skeleton1.setQuantityOfArrows(10);
        skeleton1.setWeapon(weapon);
        System.out.println("Skeleton1:    " + skeleton1.printInfo());
    }
}
