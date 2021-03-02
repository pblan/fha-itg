import java.util.ArrayList;

/*
 * Autor  : Benjamin Poniatowski
 * Aufgabe: 5.1 RAID
 * Datum  : 06.12.2010
 * Status : in Arbeit
 */

// Interface für die verschiedenen Raidlevel
public interface RaidLevel {
	// Methode zum Schreiben von Text
	public void writeBits(ArrayList<HardDisc> hd, String input);
	
	// Methode zum Lesen von Text
	public String readBits(ArrayList<HardDisc> hd);
	
	//Zum wiederherstellen defekter Platten, sofern es moeglich ist
	public void restoreHD(ArrayList<HardDisc> hd, int index) throws Exception;
}
