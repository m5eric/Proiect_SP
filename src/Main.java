public class Main {

	public static void main(String[] args) {
		Carte discoTitanic = new Carte("Disco Titanic");
		Autor rpGheo = new Autor("Radu Pavel Gheo");
			
		discoTitanic.addAuthor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Capitol chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubCapitol("Subcapitolul 1.1");
		Subcapitol scOneOne = chp1.getSubCapitol(indexSubChapterOneOne);
			
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
	}

}