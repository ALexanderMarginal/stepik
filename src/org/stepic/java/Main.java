package org.stepic.java;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
          TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
          to see how IntelliJ IDEA suggests fixing it.
          System.out.println("Hello and welcome!");
          for (int i = 1; i <= 5; i++) {
          	//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
          	// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
          	System.out.println("i = " + i);
          }
          System.out.println(org.stepik.java.LeapYearCount.leapYearCount(101));
          System.out.println(org.stepik.java.DoubleExpression.doubleExpression(.1, .2, .3));
          System.out.println(org.stepik.java.FlipBit.flipBit(0, 1));
          System.out.println(org.stepik.java.CharExpression.charExpression(32));
          System.out.println(org.stepik.java.IsPowerOfTwo.isPowerOfTwo(1));
          System.out.println(org.stepik.java.IsPalindrome.isPalindrome("Madam, I'm Adam!"));
          System.out.println(org.stepik.java.Factorial.factorial(3));
          System.out.println(Arrays.toString(org.stepik.java.MergeArrays.mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3})));

          new CommentsAnalyzerTest();
         */

        configureLogging();
    }

    private static void configureLogging() {
        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);

        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);

        Logger commonLogger = Logger.getLogger("org.stepic.java");

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());

        commonLogger.addHandler(handler);
        commonLogger.setUseParentHandlers(false);
    }
}