package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * This class implements {@link InternalHomeworkMysteriousHamsterGame#hamsterRun()} method that runs
 * the {@code doSomething} methods on a mysterious hamster.
 *
 * @author Schweikert,Fritsche
 *
 */
public final class HomeworkMysteriousHamsterGame extends InternalHomeworkMysteriousHamsterGame {

	@Override
	protected void hamsterRun() {
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething4()");
		mysteriousPaule.turnRight();
		mysteriousPaule.write("Executing operation: doSomething9()");
		mysteriousPaule.putDownAllGrains();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething1()");
		mysteriousPaule.turnLeft2();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething1()");
		mysteriousPaule.turnLeft2();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething4()");
		mysteriousPaule.turnRight();
		mysteriousPaule.write("Executing operation: doSomething9()");
		mysteriousPaule.putDownAllGrains();
		mysteriousPaule.write("Executing operation: doSomething1()");
		mysteriousPaule.turnLeft2();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething3()");
		mysteriousPaule.turnBack();
		mysteriousPaule.write("Executing operation: doSomething7()");
		mysteriousPaule.pickUpGrain2();
		mysteriousPaule.write("Executing operation: doSomething6()");
		mysteriousPaule.writeCountedSteps();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething4()");
		mysteriousPaule.turnRight();
		mysteriousPaule.write("Executing operation: doSomething9()");
		mysteriousPaule.putDownAllGrains();
		mysteriousPaule.write("Executing operation: doSomething3()");
		mysteriousPaule.turnBack();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething7()");
		mysteriousPaule.pickUpGrain2();
		mysteriousPaule.write("Executing operation: doSomething3()");
		mysteriousPaule.turnBack();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething4()");
		mysteriousPaule.turnRight();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething2()");
		mysteriousPaule.moveAndCount();
		mysteriousPaule.write("Executing operation: doSomething8()");
		mysteriousPaule.sayImDone();
	}

	/**
	 * Returns the {@link MysteriousHamster} mysteriousPaule.
	 */
	MysteriousHamster getHamster() {
		return mysteriousPaule;
	}
}
