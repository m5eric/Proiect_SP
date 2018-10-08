import java.util.List;

public class Capitol {
	private String titluCapitol;
	private List<Subcapitol> subcapitole;
	
	public Capitol(String titluCapitol) {
		this.setTitluCapitol(titluCapitol);
	}

	public int createSubCapitol(String string) {
		subcapitole.add(new Subcapitol(string));
		return subcapitole.size();
	}

	public Subcapitol getSubCapitol(int indexSubChapterOneOne) {
		return this.subcapitole.get(indexSubChapterOneOne);
	}

	public String getTitluCapitol() {
		return titluCapitol;
	}

	public void setTitluCapitol(String titluCapitol) {
		this.titluCapitol = titluCapitol;
	}

	public List<Subcapitol> getSubcapitole() {
		return subcapitole;
	}

	public void setSubcapitole(List<Subcapitol> subcapitole) {
		this.subcapitole = subcapitole;
	}
}