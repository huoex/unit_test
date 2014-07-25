package hex.com.unit01;

import static org.mockito.Matchers.*;
import static org.powermock.api.mockito.PowerMockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.powermock.api.mockito.PowerMockito.*;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(A.class) 
public class BTest {

	@Test
	public void test() {
		 mockStatic(A.class); 
		 when(A.Afun(anyString())).thenReturn("TT"); 
		 B b= new B();
		 b.Bfun();
	}

}
