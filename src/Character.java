public abstract class Character {
    WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weapon = w;
    }
}
