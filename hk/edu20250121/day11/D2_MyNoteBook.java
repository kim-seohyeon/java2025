package hk.edu20250121.day11;

public class D2_MyNoteBook extends D2_NoteBook{

	//Computer <-- NoteBook <-- MyNoteBook
	//상위의 모든 메서드들을 사용할 수 있음
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing!!");
	}

	
}
