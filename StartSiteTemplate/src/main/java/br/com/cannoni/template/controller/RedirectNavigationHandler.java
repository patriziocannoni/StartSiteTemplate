package br.com.cannoni.template.controller;

import java.util.Map;
import java.util.Set;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.application.NavigationCase;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;

/**
 * @author patrizio
 * @since 19/12/2014
 * 
 */
public class RedirectNavigationHandler extends ConfigurableNavigationHandler {
    
    private static final String NAVIGATION_REDIRECT_SUFFIX = "faces-redirect=true";
    
    private static final String NAVIGATION_REDIRECT_SUFFIX_URL = "?" + NAVIGATION_REDIRECT_SUFFIX;

    private NavigationHandler parent;

    public RedirectNavigationHandler(NavigationHandler parent) {
        this.parent = parent;
    }

    @Override
    public void handleNavigation(FacesContext context, String from, String outcome) {
        if (outcome != null && outcome.indexOf(NAVIGATION_REDIRECT_SUFFIX) == -1) {
            outcome += NAVIGATION_REDIRECT_SUFFIX_URL;
        }
        parent.handleNavigation(context, from, outcome);
    }

    @Override
    public NavigationCase getNavigationCase(FacesContext context, String fromAction, String outcome) {
        if (parent instanceof ConfigurableNavigationHandler) {
            return ((ConfigurableNavigationHandler) parent).getNavigationCase(context, fromAction, outcome);
        }
        return null;
    }

    @Override
    public Map<String, Set<NavigationCase>> getNavigationCases() {
        if (parent instanceof ConfigurableNavigationHandler) {
            return ((ConfigurableNavigationHandler) parent).getNavigationCases();
        }
        return null;
    }

}