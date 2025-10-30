class Unlocked implements DoorState {
    public void open(Door ctx)   { System.out.println("🚪 Abriendo puerta"); }
    public void lock(Door ctx)   { System.out.println("🔒 Bloqueada"); ctx.setState(new Locked()); }
    public void unlock(Door ctx) { System.out.println("🔓 Ya estaba desbloqueada"); }
}