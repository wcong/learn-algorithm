package org.wcong.algorithm.ctci.treegraph;

/**
 * give a list of project and a list of dependencies
 * find a build order that allow all project to be build
 * if none return error
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 13/12/2017
 */
public class BuildOrder {

    static class Project {
        int id;
        Project[] dependencies;
    }


}
