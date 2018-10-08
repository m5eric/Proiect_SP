import java.util.List;

public class Carte {
	private String titlu;
	private List<Autor> autori;
	private List<Capitol> capitole;
	
	public Carte(String titlu) {
		this.titlu=titlu;
	}
	
	public void print() {
		System.out.println("titlu " + titlu);
		for (int i = 0; i<= autori.size(); i++) {
			System.out.println("autor " + i + autori.get(i));
		}
		for(int i = 0; i<= capitole.size(); i++) {
			System.out.println("capitol " + i + capitole.get(i));
		}
	}

	public void addAuthor(Autor rpGheo) {
		autori.add(rpGheo);		
	}

	public int createChapter(String string) {
		capitole.add(new Capitol(string));
		return capitole.size();
	}

	public Capitol getCapitol(int indexChapterOne) {
		// TODO Auto-generated method stub
		return null;
	}

	public Capitol getChapter(int indexChapterOne) {
		return this.capitole.get(indexChapterOne);
	}

	public List<Autor> getAutori() {
		return autori;
	}

	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}

	public List<Capitol> getCapitole() {
		return capitole;
	}

	public void setCapitole(List<Capitol> capitole) {
		this.capitole = capitole;
	}
}