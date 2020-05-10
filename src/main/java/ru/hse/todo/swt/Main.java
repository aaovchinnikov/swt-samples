package ru.hse.todo.swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main {

	public static void main(String[] args) {
		Display display = new Display(); 		// Application registers itself to OS-events.
		Shell shell = new Shell(display);		// Create and register window at OS. 
		shell.setText("Snippet 1");				// Set parameter and inform OS.
		shell.open();							// Ask OS to make window visible and active.
		while (!shell.isDisposed()) {			// Loop while main window is alive.
			if (!display.readAndDispatch()) {	// Uses OS-native and Java code to get next OS-event 
												// and dispatch it to correct Listener. 
												// Also handles inter-thread-messages here.
				display.sleep();				// If nothing to do for now - thread goes to sleep.
												// Display has callback from OS into JVM to wake-up the thread,
												// go to next while-cycle, check window and process next event.
			}
		}
		display.dispose();
	}											 
	// All OS-events listening, processing, dispatching and handling performed by ONE thread - main()!
	// That's why it's so important to do not generate more events in 
	// handlers/listeners (e.g. perform UI reconstruction) - this would lead to exceptions
	// and undefined behavior and potential application crash.
	// Use Display#asyncExec(Runnable) for this purpose.
	// Do not call Display#syncExec(Runnable) in handlers/UI-thread, it's for any other thread only.   
}
