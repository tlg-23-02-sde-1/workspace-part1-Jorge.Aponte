class RandomNumberFrequency {

    public int randomInt(int min, int max) {
        double rand = (int) Math.round((Math.random() * (max - min)) + min);
        return (int) rand;
    }
}