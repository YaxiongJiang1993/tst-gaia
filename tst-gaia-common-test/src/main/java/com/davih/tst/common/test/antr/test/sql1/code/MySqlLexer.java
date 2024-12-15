// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/test/sql1/MySql.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.test.sql1.code;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MySqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, STAR=6, COMMA=7, LPAREN=8, RPAREN=9, 
		EQ=10, NEQ=11, LT=12, GT=13, LEQ=14, GEQ=15, ID=16, STRING=17, INT=18, 
		SEMICOLON=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "AND", "OR", "STAR", "COMMA", "LPAREN", "RPAREN", 
			"EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "ID", "STRING", "INT", "SEMICOLON", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'*'", "','", "'('", "')'", "'='", 
			"'<>'", "'<'", "'>'", "'<='", "'>='", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "AND", "OR", "STAR", "COMMA", "LPAREN", 
			"RPAREN", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "ID", "STRING", "INT", 
			"SEMICOLON", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MySqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MySql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\\\b\u000f\n\u000f\f\u000f_\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0005\u0010c\b\u0010\n\u0010\f\u0010f\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011k\b\u0011\u000b\u0011"+
		"\f\u0011l\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013r\b\u0013\u000b"+
		"\u0013\f\u0013s\u0001\u0013\u0001\u0013\u0001d\u0000\u0014\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0012\u0002\u0000"+
		"SSss\u0002\u0000EEee\u0002\u0000LLll\u0002\u0000CCcc\u0002\u0000TTtt\u0002"+
		"\u0000FFff\u0002\u0000RRrr\u0002\u0000OOoo\u0002\u0000MMmm\u0002\u0000"+
		"WWww\u0002\u0000HHhh\u0002\u0000AAaa\u0002\u0000NNnn\u0002\u0000DDdd\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  z"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000"+
		"\u00030\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u0007;"+
		"\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bB\u0001\u0000"+
		"\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000fF\u0001\u0000\u0000\u0000"+
		"\u0011H\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015L"+
		"\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000"+
		"\u0000\u0000\u001bS\u0001\u0000\u0000\u0000\u001dV\u0001\u0000\u0000\u0000"+
		"\u001fY\u0001\u0000\u0000\u0000!`\u0001\u0000\u0000\u0000#j\u0001\u0000"+
		"\u0000\u0000%n\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000\u0000)*\u0007"+
		"\u0000\u0000\u0000*+\u0007\u0001\u0000\u0000+,\u0007\u0002\u0000\u0000"+
		",-\u0007\u0001\u0000\u0000-.\u0007\u0003\u0000\u0000./\u0007\u0004\u0000"+
		"\u0000/\u0002\u0001\u0000\u0000\u000001\u0007\u0005\u0000\u000012\u0007"+
		"\u0006\u0000\u000023\u0007\u0007\u0000\u000034\u0007\b\u0000\u00004\u0004"+
		"\u0001\u0000\u0000\u000056\u0007\t\u0000\u000067\u0007\n\u0000\u00007"+
		"8\u0007\u0001\u0000\u000089\u0007\u0006\u0000\u00009:\u0007\u0001\u0000"+
		"\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0007\u000b\u0000\u0000<=\u0007"+
		"\f\u0000\u0000=>\u0007\r\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0007"+
		"\u0007\u0000\u0000@A\u0007\u0006\u0000\u0000A\n\u0001\u0000\u0000\u0000"+
		"BC\u0005*\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005,\u0000\u0000"+
		"E\u000e\u0001\u0000\u0000\u0000FG\u0005(\u0000\u0000G\u0010\u0001\u0000"+
		"\u0000\u0000HI\u0005)\u0000\u0000I\u0012\u0001\u0000\u0000\u0000JK\u0005"+
		"=\u0000\u0000K\u0014\u0001\u0000\u0000\u0000LM\u0005<\u0000\u0000MN\u0005"+
		">\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005<\u0000\u0000P\u0018"+
		"\u0001\u0000\u0000\u0000QR\u0005>\u0000\u0000R\u001a\u0001\u0000\u0000"+
		"\u0000ST\u0005<\u0000\u0000TU\u0005=\u0000\u0000U\u001c\u0001\u0000\u0000"+
		"\u0000VW\u0005>\u0000\u0000WX\u0005=\u0000\u0000X\u001e\u0001\u0000\u0000"+
		"\u0000Y]\u0007\u000e\u0000\u0000Z\\\u0007\u000f\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^ \u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"`d\u0005\'\u0000\u0000ac\t\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\'\u0000"+
		"\u0000h\"\u0001\u0000\u0000\u0000ik\u0007\u0010\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000m$\u0001\u0000\u0000\u0000no\u0005;\u0000\u0000o&\u0001"+
		"\u0000\u0000\u0000pr\u0007\u0011\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0006\u0013\u0000\u0000v(\u0001\u0000"+
		"\u0000\u0000\u0005\u0000]dls\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}