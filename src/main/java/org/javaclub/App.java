package org.javaclub;


import org.javaclub.dagger.single.DaggerSingleProcessorComponent;
import org.javaclub.dagger.single.SingleProcessorComponent;
import org.javaclub.dagger.set.DaggerSetProcessorComponent;
import org.javaclub.dagger.set.SetProcessorComponent;

public class App {
    public static void main(String[] args) {
        System.out.println("<-- Single injection -->");
        SingleProcessorComponent singleProcessorComponent = DaggerSingleProcessorComponent.builder().build();
        SingleProcessor singleProcessor = singleProcessorComponent.singleProcessor();
        singleProcessor.process("Hello Dagger");

        System.out.println("<-- Set injection -->");
        SetProcessorComponent setProcessorComponent = DaggerSetProcessorComponent.create();
        SetProcessor setProcessor = setProcessorComponent.setProcessor();
        setProcessor.process("Hello Set");

    }
}
