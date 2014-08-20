package util;

public abstract class AbstractScheduler extends Thread {
	
	protected static final long ONE_DAY = 86400000L;
	protected static final long ONE_WEEK = 604800000L;
	protected static final long ONE_MONTH = 2419200000L;
	
	
	@Override
	public void run() {
		Logger.log(getDisplayName() + " scheduler is running");
		while (true) {
			try {
				executeSchedulerTask();
				Thread.sleep(getTimePeriod());
			} catch (InterruptedException e) {
				Logger.log("Shutting down thread: " + this.getClass().getName());
				return;
			} catch (Exception e) {
				Logger.err("A Scheduler Task caused an error.");
			}
		}
	}
	
	/**
	 * Executes a schedulerTask
	 */
	public abstract void executeSchedulerTask();
	
	/**
	 * @return a human readable name (for the log)
	 */
	public abstract String getDisplayName();
	
	/**
	 * @return the period in which the task shall be called
	 */
	public abstract long getTimePeriod();
}
