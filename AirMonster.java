class AirMonster extends Monster {

    // TODO : add constructor and initialize type to "air"

    public AirMonster(String name, int attack) {
        super(name, attack, "air");
    }

    // TODO : create an attack method which deals x2 damage to "water"

    @Override
    public boolean attack(Monster opponent) {

        int opponentCurrentLife = opponent.getLife();

        int damage = this.getAttack();
        if (opponent.getType().equals("water")) {
            damage = damage * 2;
        }

        opponentCurrentLife = opponentCurrentLife - damage;
        opponent.setLife(opponentCurrentLife);

        return opponent.isKO();
    }
}