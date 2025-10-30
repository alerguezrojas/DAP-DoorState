class Locked implements DoorState {
    public void open(Door ctx)   { System.out.println("🚫 No se puede abrir: está bloqueada"); }
    public void lock(Door ctx)   { System.out.println("🔒 Ya estaba bloqueada"); }
    public void unlock(Door ctx) { System.out.println("🔓 Desbloqueada"); ctx.setState(new Unlocked()); }
}