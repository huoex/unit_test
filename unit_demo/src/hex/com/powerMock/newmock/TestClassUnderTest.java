package hex.com.powerMock.newmock;

import java.io.File;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)  
public class TestClassUnderTest {

    @Test  
    @PrepareForTest(ClassUnderTest.class)  
    public void testCallInternalInstance() throws Exception {  

        File file = PowerMockito.mock(File.class);  

        ClassUnderTest underTest = new ClassUnderTest();  

        PowerMockito.whenNew(File.class).withArguments("bbb").thenReturn(file);  
        
        PowerMockito.when(file.exists()).thenReturn(true);  

        Assert.assertTrue(underTest.callInternalInstance("bbb"));  
    }  
}