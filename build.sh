#!/bin/bash -e

pushd static/client
./build.sh
popd

pushd services/auth
./build.sh
popd

pushd services/api
#./build.sh
popd

pushd services/correlator
#./build.sh
popd


