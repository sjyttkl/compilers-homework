package compiler.abstree.tree;

import compiler.abstree.AbsVisitor;

/**
 * Abstraktno sintaksno drevo.
 *
 * (Da se izognemo celi vrsti metod za delo s polji razredov paketa
 * `compiler.abstree', so vsa polja (in vse metode) v paketu `compiler.abstree'
 * definirane kot `public'. Pri programiranju se drzimo pravila, da vrednosti
 * teh polj le beremo, nastavljamo pa jih le preko konstruktorjev.)
 *
 * @see AbsDecl
 * @see AbsDecls
 * @see AbsProgram
 * @see AbsStmt
 * @see AbsStmts
 * @see AbsTypeExpr
 * @see AbsValExpr
 * @see AbsValExprs
 */
public abstract class AbsTree {

	/** Oznaka za napako.
	 *
	 * V kolikor velja <code>error==true</code>, so vsi ostalo podatki v drevesu neveljavi. */
	public boolean error = false;

	/**
	 * Vrstica prvega znaka simbola, s katerim se zacne koda, opisana s tem
	 * drevesom.
	 */
	public int begLine;

	/**
	 * Stolpec prvega znaka simbola, s katerim se zacne koda, opisana s tem
	 * drevesom.
	 */
	public int begColumn;

	/**
	 * Vrstica prvega znaka simbola, s katerim se konca koda, opisana s tem
	 * drevesom.
	 */
	public int endLine;

	/**
	 * Stolpec prvega znaka simbola, s katerim se konca koda, opisana s tem
	 * drevesom.
	 */
	public int endColumn;

	public AbsTree() {
		this.begLine = 0;
		this.begColumn = 0;
		this.endLine = 0;
		this.endColumn = 0;
	}

	/** Doloci zacetek te stavcne oblike v vhodni datoteki. */
	public AbsTree setBeg(String lexeme, int line, int column) {
		begLine = line;
		begColumn = column;
                return this;
	}

	/** Doloci zacetek te stavcne oblike v vhodni datoteki. */
	public AbsTree setBeg(AbsTree tree) {
		begLine = tree.begLine;
		begColumn = tree.begColumn;
                return this;
	}

	/** Doloci konec te stavcne oblike v vhodni datoteki. */
	public AbsTree setEnd(String lexeme, int line, int column) {
		endLine = line;
		endColumn = column + lexeme.length() - 1;
                return this;
	}

	/** Doloci konec te stavcne oblike v vhodni datoteki. */
	public AbsTree setEnd(AbsTree tree) {
		endLine = tree.endLine;
		endColumn = tree.endColumn;
                return this;
	}

	/** Doloci zacetek in konec stavcne oblike v vhodni datoteki. */
	public AbsTree setPos(String lexeme, int line, int column) {
		setBeg(lexeme, line, column);
		setEnd(lexeme, line, column);
                return this;
	}

	/** Doloci zacetek in konec stavcne oblike v vhodni datoteki. */
	public AbsTree setPos(AbsTree tree) {
		setBeg(tree);
		setEnd(tree);
                return this;
	}

	public abstract void accept(AbsVisitor visitor);

}
