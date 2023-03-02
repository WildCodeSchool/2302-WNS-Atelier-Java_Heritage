class FireMonster extends Monster {

    // TODO : add constructor and initialize type to "fire"

    public FireMonster(String name, int attack) {
        super(name, attack, "fire");
    }

    // TODO : create an attack method which deals x2 damage to "air"

    @Override
    public boolean attack(Monster opponent) {

        int opponentCurrentLife = opponent.getLife();

        int damage = this.getAttack();
        if (opponent.getType().equals("air")) {
            damage = damage * 2;
        }

        opponentCurrentLife = opponentCurrentLife - damage;
        opponent.setLife(opponentCurrentLife);

        return opponent.isKO();
    }
}