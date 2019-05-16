package org.javaclub.dagger.set;

import dagger.Component;
import org.javaclub.SetProcessor;
import org.javaclub.dagger.single.SingleProcessorModule;

@Component(modules = {SetProcessorModule.class, SingleProcessorModule.class})
public interface SetProcessorComponent {
    SetProcessor setProcessor();
}
