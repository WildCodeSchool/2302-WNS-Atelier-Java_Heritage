class WaterMonster extends Monster {

    // TODO : add constructor and initialize type to "water"

    public WaterMonster(String name, int attack) {
        super(name, attack, "water");
    }

    // TODO : create an attack method which deals x2 damage to "fire"

    @Override
    public boolean attack(Monster opponent) {

        int opponentCurrentLife = opponent.getLife();

        int damage = this.getAttack();
        if (opponent.getType().equals("fire")) {
            damage = damage * 2;
        }

        opponentCurrentLife = opponentCurrentLife - damage;
        opponent.setLife(opponentCurrentLife);

        return opponent.isKO();
    }

}