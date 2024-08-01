JFLAGS = -g
JC = javac
app = ContaBancaria

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		  $(app).java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
	
run: classes
	java $(app)