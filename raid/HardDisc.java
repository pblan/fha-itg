import java.util.ArrayList;

/*
 * Autor  : Benjamin Poniatowski
 * Aufgabe: 5.1 RAID
 * Datum  : 06.12.2010
 * Status : in Arbeit
 */

// Klasse für eine Festplatte
public class HardDisc {
	boolean isOff = false;
	// Liste von Bits (Boolean pro Bit)
	private ArrayList<Boolean> bits = new ArrayList<Boolean>();
	
	// Fügt ein Bit hinzu
	public void putBit(boolean b) {
		bits.add(b);
	}
	
	public void setBit(int index, boolean b) {
		bits.set(index, b);
	}
	
	// Gibt das i'te Bit zurück
	public boolean getBit(int index) {
		return bits.get(index);
	}
	
	// Gibt die Anzahl der geschriebenen Bits zurück
	public int size() {
		return bits.size();
	}
	// zum De-/Aktivieren der Platte
	public void setOff(boolean b) {
		this.isOff = b;
	}
	// Status der Platte
	public boolean isOff() {
		return this.isOff;
	}
	// Formartierung der Platte
	public void formatHD() {
		this.bits.clear();
	}
}
