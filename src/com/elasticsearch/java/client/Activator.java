package com.elasticsearch.java.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * 
 * 
 * @author sidharthan.r
 * @version 1.0.0
 * @since 1.0.0
 * 
 */

public class Activator implements BundleActivator {
	/**
	 * Bundle Context.
	 */
	private static BundleContext context;

	/**
	 * 
	 * 
	 * @return BundleContext
	 */

	public static BundleContext getContext() {
		return context;
	}

	/**
	 * @param bundleContext
	 *            the bundleContext
	 * @throws Exception
	 *             Exception .
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 *      )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/**
	 * @param bundleContext
	 *            the bundleContext
	 * @throws Exception
	 *             Exception .
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
}
