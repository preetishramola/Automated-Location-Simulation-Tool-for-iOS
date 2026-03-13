# Automated Location Simulation Tool for iOS

An automation tool that simulates device GPS movement in the iOS development environment by dynamically updating GPX files used by Xcode.

## Overview

Testing location-based applications often requires repeatedly changing device coordinates manually. This project automates that process by programmatically modifying GPX files to simulate continuous movement along predefined routes.

## Features

- Automated GPX file generation and updates
- Simulates real-time GPS movement
- Eliminates manual editing of GPX files
- Helps developers test location-based iOS applications efficiently

## How It Works

1. The tool generates or modifies GPX files containing location coordinates.
2. These GPX files are used by Xcode's location simulation feature.
3. The script updates the coordinates dynamically to simulate movement.

## Technologies Used

- File Processing
- GPX Format
- iOS Development Environment
- Automation Scripts

## Project Structure
gpsspoof/
 ├── scripts/
 ├── gpx-files/
 ├── automation-script
 └── README.md
