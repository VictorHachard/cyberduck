package ch.cyberduck.core.openstack;

/*
 * Copyright (c) 2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * feedback@cyberduck.ch
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathContainerService;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Restore;
import ch.cyberduck.core.DefaultPathContainerService;
import ch.cyberduck.core.LoginCallback;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

import ch.iterate.openstack.swift.Response;
import ch.iterate.openstack.swift.exception.GenericException;

public class SwiftRestoreFeature implements Restore {
    private static final Logger log = LogManager.getLogger(SwiftObjectListService.class);

    private final SwiftSession session;
    private final PathContainerService containerService = new DefaultPathContainerService();
    private final SwiftRegionService regionService;
    private final SwiftSegmentService segmentService;

    public SwiftRestoreFeature(final SwiftSession session) {
        this(session, new SwiftRegionService(session));
    }

    public SwiftRestoreFeature(final SwiftSession session, final SwiftRegionService regionService) {
        this(session, regionService, new SwiftSegmentService(session));
    }

    public SwiftRestoreFeature(final SwiftSession session, final SwiftRegionService regionService, final SwiftSegmentService segmentService) {
        this.session = session;
        this.regionService = regionService;
        this.segmentService = segmentService;
    }

    @Override
    public void restore(Path file, LoginCallback prompt) throws BackgroundException {

    }

    @Override
    public boolean isRestorable(Path file) {
        return false;
    }

}
