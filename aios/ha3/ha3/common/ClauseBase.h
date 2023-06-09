/*
 * Copyright 2014-present Alibaba Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#pragma once

#include <memory>
#include <string>

#include "autil/Log.h" // IWYU pragma: keep

namespace autil {
class DataBuffer;
}  // namespace autil

namespace isearch {
namespace common {

class ClauseBase
{
public:
    ClauseBase();
    virtual ~ClauseBase();
private:
    ClauseBase(const ClauseBase &);
    ClauseBase& operator=(const ClauseBase &);
public:
    void setOriginalString(const std::string& originalString) {
        _originalString = originalString;
    }
    const std::string& getOriginalString() const {
        return _originalString;
    }

    virtual void serialize(autil::DataBuffer &dataBuffer) const = 0;
    virtual void deserialize(autil::DataBuffer &dataBuffer) = 0;
    virtual std::string toString() const = 0;

    static std::string cluster2ZoneName(const std::string& clusterName);
protected:
    static std::string boolToString(bool flag);
protected:
    std::string _originalString;
private:
    AUTIL_LOG_DECLARE();
};


typedef std::shared_ptr<ClauseBase> ClauseBasePtr;

} // namespace common
} // namespace isearch
