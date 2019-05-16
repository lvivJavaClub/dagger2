package org.javaclub.dagger.single;

import dagger.Component;
import org.javaclub.SingleProcessor;

@Component(modules = SingleProcessorModule.class)
public interface SingleProcessorComponent {
    SingleProcessor singleProcessor();
}
