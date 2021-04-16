package com.globant.test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.logging.Logger;


    public class Listeners implements ITestListener {
        /**
         * Unit test for simple App.
         */
        @Override
        public void onTestStart(ITestResult iTestResult) {
        }
        /**
         * Unit test for simple App.
         */
        @Override
        public void onTestSuccess(ITestResult iTestResult) {
            Logger logger = Logger.getLogger(EjercicioTest.class.getName());
            logger.info("el test " +iTestResult.getName() +"paso exitosamente");
        }
        /**
         * Unit test for simple App.
         */
        @Override
        public void onTestFailure(ITestResult iTestResult) {
        }
        /**
         * Unit test for simple App.
         */
        @Override
        public void onTestSkipped(ITestResult iTestResult) {
        }
        /**
         * Unit test for simple App.
         */
        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        }
        /**
         * Unit test for simple App.
         */
        @Override
        public void onStart(ITestContext iTestContext) {
        }
        /**
         * Unit test for simple App.
         */
        @Override
        public void onFinish(ITestContext iTestContext) {

        }
    }





