package ch.zhaw.it.prog2.wordcloud;
/**
 * Most basic interface for beeing an observer
 * @author bles
 *
 */
public interface IsObserver {
	/**
	 * This method is always called when an observed object changes
	 */
	void update();
}
