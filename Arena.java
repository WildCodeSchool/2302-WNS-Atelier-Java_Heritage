class Arena {

    public static void main(String[] args) {
        FireMonster fireMonster = new FireMonster("Fire Monster", 3);
        AirMonster waterMonster = new AirMonster("Air Monster", 3);

        while (fireMonster.getLife() > 0 && waterMonster.getLife() > 0) {
            // combat
            boolean isOpponentKO = fireMonster.attack(waterMonster);

            if (!isOpponentKO) {
                waterMonster.attack(fireMonster);
            }
        }
    }
}