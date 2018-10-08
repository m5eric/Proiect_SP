import java.util.List;

public class Subcapitol {
	private String titluSubcap;
	private List<Text> paragrafe;
	private List<Imagine> imagini;
	private List<Tabel> tabele;
	
		
	public Subcapitol(String titluSubcap) {
		this.setTitluSubcap(titluSubcap);
	}

	public void createNewParagraph(String string) {
		paragrafe.add(new Text(string));		
	}

	public void createNewImage(String string) {
		imagini.add(new Imagine(string));
		
	}

	public void createNewTable(String string) {
		tabele.add(new Tabel(string));
	}

	public List<Text> getParagrafe() {
		return paragrafe;
	}

	public void setParagrafe(List<Text> paragrafe) {
		this.paragrafe = paragrafe;
	}

	public String getTitluSubcap() {
		return titluSubcap;
	}

	public void setTitluSubcap(String titluSubcap) {
		this.titluSubcap = titluSubcap;
	}

	public List<Imagine> getImagini() {
		return imagini;
	}

	public void setImagini(List<Imagine> imagini) {
		this.imagini = imagini;
	}

	public List<Tabel> getTabele() {
		return tabele;
	}

	public void setTabele(List<Tabel> tabele) {
		this.tabele = tabele;
	}
}