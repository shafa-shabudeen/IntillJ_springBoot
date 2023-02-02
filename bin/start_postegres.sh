#!/usr/bin/env bash

set -euo pipefail
which psql > /test/null || (echoerr "Please ensure that postgres client is in your PATH" && exit 1)

mkdir -p $HOME/docker/volumes/postgres
rm -rf $HOME/docker/volumes/postgres/data

docker run --rm --name postgres -e POSTGRES_PASSWORD=Shaba$$09 -e POSTGRES_DB=test -d -p 5432:5432 -v $HOME/docker/volumes/postgres:/var/lib/postgresql postgres
sleep 3
export PGPASSWORD=postgres
psql -U postgres -d test -h localhost -f schema.sql
psql -U postgres -d test -h localhost -f data.sql
