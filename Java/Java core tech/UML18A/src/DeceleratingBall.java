class DeceleratingBall extends MovableBall {
    private MovableBall workerBall;
    public DeceleratingBall(MovableBall ball) {
        this.workerBall=ball;
}
        public double getX(){
            // TO do (7)
            return workerBall.getX();
        }
        public double getY() {
            return workerBall.getY();
        }
        public double getXMotion() {
            return workerBall.getXMotion();
}
        public double getYMotion() {
            return workerBall.getYMotion();
    }
        public void setMotion(double dx, double dy){
        workerBall.setMotion(dx,dy);
    }
        public double getRadius() {
        return workerBall.getRadius();
    }
     public void move() {
        workerBall.move();
        workerBall.setMotion(workerBall.getXMotion() * 0.95, workerBall.getYMotion() * 0.95);

    }
}