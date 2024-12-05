package de.unistuttgart.iste.sqa.pse.sheet07.presence.immutable;
final class MyImutibleStudent {
    private final String name;
    private final long matrikelnummer;

    MyImutibleStudent(String name, long matrickelnummer) {
        this.name =name;
        this.matrikelnummer = matrickelnummer;
    }
    public String getName() {
        return name;
    }
    public long getMatrikelnummer() {
        return matrikelnummer;
    }
    
    
}