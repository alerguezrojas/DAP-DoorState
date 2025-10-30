class Door {
    private DoorState state = new Locked();
    void setState(DoorState s) { this.state = s; }

    public void open()   { state.open(this); }
    public void lock()   { state.lock(this); }
    public void unlock() { state.unlock(this); }

    public static void main(String[] args) {
        Door d = new Door();
        d.open();    // No se puede abrir
        d.unlock();  // Pasa a Unlocked
        d.open();    // Abre
        d.lock();    // Vuelve a Locked
    }
}